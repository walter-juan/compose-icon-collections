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

public val SolidGroup.Bars3BottomRight: ImageVector
    get() {
        if (_bars3BottomRight != null) {
            return _bars3BottomRight!!
        }
        _bars3BottomRight = Builder(name = "Bars3BottomRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.75f)
                curveTo(3.0f, 6.336f, 3.336f, 6.0f, 3.75f, 6.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 6.0f, 21.0f, 6.336f, 21.0f, 6.75f)
                curveTo(21.0f, 7.164f, 20.664f, 7.5f, 20.25f, 7.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 7.5f, 3.0f, 7.164f, 3.0f, 6.75f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 11.586f, 3.336f, 11.25f, 3.75f, 11.25f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 11.25f, 21.0f, 11.586f, 21.0f, 12.0f)
                curveTo(21.0f, 12.414f, 20.664f, 12.75f, 20.25f, 12.75f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 12.75f, 3.0f, 12.414f, 3.0f, 12.0f)
                close()
                moveTo(11.25f, 17.25f)
                curveTo(11.25f, 16.836f, 11.586f, 16.5f, 12.0f, 16.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 16.5f, 21.0f, 16.836f, 21.0f, 17.25f)
                curveTo(21.0f, 17.664f, 20.664f, 18.0f, 20.25f, 18.0f)
                horizontalLineTo(12.0f)
                curveTo(11.586f, 18.0f, 11.25f, 17.664f, 11.25f, 17.25f)
                close()
            }
        }
        .build()
        return _bars3BottomRight!!
    }

private var _bars3BottomRight: ImageVector? = null
