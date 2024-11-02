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

public val SolidGroup.H1: ImageVector
    get() {
        if (_h1 != null) {
            return _h1!!
        }
        _h1 = Builder(name = "H1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.243f, 3.743f)
                curveTo(2.657f, 3.743f, 2.993f, 4.079f, 2.993f, 4.493f)
                verticalLineTo(11.244f)
                horizontalLineTo(11.993f)
                verticalLineTo(4.494f)
                curveTo(11.993f, 4.08f, 12.329f, 3.744f, 12.743f, 3.744f)
                curveTo(13.158f, 3.744f, 13.493f, 4.08f, 13.493f, 4.494f)
                verticalLineTo(19.495f)
                curveTo(13.493f, 19.91f, 13.158f, 20.245f, 12.743f, 20.245f)
                curveTo(12.329f, 20.245f, 11.993f, 19.91f, 11.993f, 19.495f)
                verticalLineTo(12.744f)
                horizontalLineTo(2.993f)
                verticalLineTo(19.495f)
                curveTo(2.993f, 19.909f, 2.657f, 20.245f, 2.243f, 20.245f)
                curveTo(1.829f, 20.245f, 1.493f, 19.909f, 1.493f, 19.495f)
                verticalLineTo(4.493f)
                curveTo(1.493f, 4.079f, 1.829f, 3.743f, 2.243f, 3.743f)
                close()
                moveTo(19.848f, 8.707f)
                curveTo(20.092f, 8.837f, 20.244f, 9.092f, 20.244f, 9.368f)
                verticalLineTo(18.744f)
                horizontalLineTo(21.744f)
                curveTo(22.158f, 18.744f, 22.494f, 19.08f, 22.494f, 19.494f)
                curveTo(22.494f, 19.908f, 22.158f, 20.244f, 21.744f, 20.244f)
                horizontalLineTo(17.244f)
                curveTo(16.83f, 20.244f, 16.494f, 19.908f, 16.494f, 19.494f)
                curveTo(16.494f, 19.08f, 16.83f, 18.744f, 17.244f, 18.744f)
                horizontalLineTo(18.744f)
                verticalLineTo(10.77f)
                lineTo(17.66f, 11.492f)
                curveTo(17.316f, 11.722f, 16.85f, 11.629f, 16.62f, 11.284f)
                curveTo(16.39f, 10.94f, 16.483f, 10.474f, 16.828f, 10.244f)
                lineTo(19.078f, 8.744f)
                curveTo(19.308f, 8.591f, 19.604f, 8.576f, 19.848f, 8.707f)
                close()
            }
        }
        .build()
        return _h1!!
    }

private var _h1: ImageVector? = null
