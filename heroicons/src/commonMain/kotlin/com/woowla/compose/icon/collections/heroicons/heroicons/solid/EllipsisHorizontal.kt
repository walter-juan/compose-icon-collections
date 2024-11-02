package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.EllipsisHorizontal: ImageVector
    get() {
        if (_ellipsisHorizontal != null) {
            return _ellipsisHorizontal!!
        }
        _ellipsisHorizontal = Builder(name = "EllipsisHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 12.0f)
                curveTo(4.5f, 11.172f, 5.172f, 10.5f, 6.0f, 10.5f)
                curveTo(6.828f, 10.5f, 7.5f, 11.172f, 7.5f, 12.0f)
                curveTo(7.5f, 12.828f, 6.828f, 13.5f, 6.0f, 13.5f)
                curveTo(5.172f, 13.5f, 4.5f, 12.828f, 4.5f, 12.0f)
                close()
                moveTo(10.5f, 12.0f)
                curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12.0f, 10.5f)
                curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12.0f)
                curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12.0f, 13.5f)
                curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveTo(16.5f, 11.172f, 17.172f, 10.5f, 18.0f, 10.5f)
                curveTo(18.828f, 10.5f, 19.5f, 11.172f, 19.5f, 12.0f)
                curveTo(19.5f, 12.828f, 18.828f, 13.5f, 18.0f, 13.5f)
                curveTo(17.172f, 13.5f, 16.5f, 12.828f, 16.5f, 12.0f)
                close()
            }
        }
        .build()
        return _ellipsisHorizontal!!
    }

private var _ellipsisHorizontal: ImageVector? = null
