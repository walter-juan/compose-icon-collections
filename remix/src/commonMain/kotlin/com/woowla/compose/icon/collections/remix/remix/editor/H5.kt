package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.H5: ImageVector
    get() {
        if (_h5 != null) {
            return _h5!!
        }
        _h5 = Builder(name = "H5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.677f)
                lineTo(17.213f, 12.636f)
                curveTo(17.544f, 12.547f, 17.891f, 12.5f, 18.25f, 12.5f)
                curveTo(20.459f, 12.5f, 22.25f, 14.291f, 22.25f, 16.5f)
                curveTo(22.25f, 18.709f, 20.459f, 20.5f, 18.25f, 20.5f)
                curveTo(16.423f, 20.5f, 14.883f, 19.276f, 14.404f, 17.603f)
                lineTo(16.327f, 17.052f)
                curveTo(16.567f, 17.888f, 17.337f, 18.5f, 18.25f, 18.5f)
                curveTo(19.355f, 18.5f, 20.25f, 17.605f, 20.25f, 16.5f)
                curveTo(20.25f, 15.395f, 19.355f, 14.5f, 18.25f, 14.5f)
                curveTo(17.619f, 14.5f, 17.057f, 14.792f, 16.69f, 15.248f)
                lineTo(14.88f, 14.344f)
                lineTo(16.0f, 8.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _h5!!
    }

private var _h5: ImageVector? = null
