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

public val SolidGroup.Window: ImageVector
    get() {
        if (_window != null) {
            return _window!!
        }
        _window = Builder(name = "Window", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 4.343f, 3.593f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 3.0f, 21.75f, 4.343f, 21.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.75f, 19.657f, 20.407f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 21.0f, 2.25f, 19.657f, 2.25f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(20.25f, 9.0f)
                horizontalLineTo(3.75f)
                verticalLineTo(18.0f)
                curveTo(3.75f, 18.828f, 4.422f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(18.75f)
                curveTo(19.578f, 19.5f, 20.25f, 18.828f, 20.25f, 18.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(5.25f, 5.25f)
                curveTo(4.836f, 5.25f, 4.5f, 5.586f, 4.5f, 6.0f)
                verticalLineTo(6.008f)
                curveTo(4.5f, 6.422f, 4.836f, 6.758f, 5.25f, 6.758f)
                horizontalLineTo(5.258f)
                curveTo(5.672f, 6.758f, 6.008f, 6.422f, 6.008f, 6.008f)
                verticalLineTo(6.0f)
                curveTo(6.008f, 5.586f, 5.672f, 5.25f, 5.258f, 5.25f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.75f, 6.0f)
                curveTo(6.75f, 5.586f, 7.086f, 5.25f, 7.5f, 5.25f)
                horizontalLineTo(7.508f)
                curveTo(7.922f, 5.25f, 8.257f, 5.586f, 8.257f, 6.0f)
                verticalLineTo(6.008f)
                curveTo(8.257f, 6.422f, 7.922f, 6.758f, 7.508f, 6.758f)
                horizontalLineTo(7.5f)
                curveTo(7.086f, 6.758f, 6.75f, 6.422f, 6.75f, 6.008f)
                verticalLineTo(6.0f)
                close()
                moveTo(9.75f, 5.25f)
                curveTo(9.336f, 5.25f, 9.0f, 5.586f, 9.0f, 6.0f)
                verticalLineTo(6.008f)
                curveTo(9.0f, 6.422f, 9.336f, 6.758f, 9.75f, 6.758f)
                horizontalLineTo(9.757f)
                curveTo(10.172f, 6.758f, 10.507f, 6.422f, 10.507f, 6.008f)
                verticalLineTo(6.0f)
                curveTo(10.507f, 5.586f, 10.172f, 5.25f, 9.757f, 5.25f)
                horizontalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _window!!
    }

private var _window: ImageVector? = null
