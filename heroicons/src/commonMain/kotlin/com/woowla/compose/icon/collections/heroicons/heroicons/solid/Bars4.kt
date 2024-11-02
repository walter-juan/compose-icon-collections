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

public val SolidGroup.Bars4: ImageVector
    get() {
        if (_bars4 != null) {
            return _bars4!!
        }
        _bars4 = Builder(name = "Bars4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 5.25f)
                curveTo(3.0f, 4.836f, 3.336f, 4.5f, 3.75f, 4.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 4.5f, 21.0f, 4.836f, 21.0f, 5.25f)
                curveTo(21.0f, 5.664f, 20.664f, 6.0f, 20.25f, 6.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 6.0f, 3.0f, 5.664f, 3.0f, 5.25f)
                close()
                moveTo(3.0f, 9.75f)
                curveTo(3.0f, 9.336f, 3.336f, 9.0f, 3.75f, 9.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 9.0f, 21.0f, 9.336f, 21.0f, 9.75f)
                curveTo(21.0f, 10.164f, 20.664f, 10.5f, 20.25f, 10.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 10.5f, 3.0f, 10.164f, 3.0f, 9.75f)
                close()
                moveTo(3.0f, 14.25f)
                curveTo(3.0f, 13.836f, 3.336f, 13.5f, 3.75f, 13.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 13.5f, 21.0f, 13.836f, 21.0f, 14.25f)
                curveTo(21.0f, 14.664f, 20.664f, 15.0f, 20.25f, 15.0f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 15.0f, 3.0f, 14.664f, 3.0f, 14.25f)
                close()
                moveTo(3.0f, 18.75f)
                curveTo(3.0f, 18.336f, 3.336f, 18.0f, 3.75f, 18.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 18.0f, 21.0f, 18.336f, 21.0f, 18.75f)
                curveTo(21.0f, 19.164f, 20.664f, 19.5f, 20.25f, 19.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 19.5f, 3.0f, 19.164f, 3.0f, 18.75f)
                close()
            }
        }
        .build()
        return _bars4!!
    }

private var _bars4: ImageVector? = null
