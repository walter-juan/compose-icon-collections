package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.SwitchFill: ImageVector
    get() {
        if (_switchFill != null) {
            return _switchFill!!
        }
        _switchFill = Builder(name = "SwitchFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.62f, 21.0f)
                curveTo(13.535f, 21.0f, 13.479f, 20.943f, 13.493f, 20.873f)
                verticalLineTo(3.127f)
                curveTo(13.493f, 3.071f, 13.535f, 3.014f, 13.606f, 3.014f)
                horizontalLineTo(16.391f)
                curveTo(18.937f, 3.014f, 21.001f, 5.079f, 21.001f, 7.624f)
                verticalLineTo(16.39f)
                curveTo(21.001f, 18.936f, 18.937f, 21.0f, 16.391f, 21.0f)
                horizontalLineTo(13.62f)
                close()
                moveTo(17.042f, 11.074f)
                curveTo(16.038f, 11.074f, 15.218f, 11.894f, 15.218f, 12.898f)
                curveTo(15.218f, 13.902f, 16.038f, 14.722f, 17.042f, 14.722f)
                curveTo(18.046f, 14.722f, 18.866f, 13.902f, 18.866f, 12.898f)
                curveTo(18.866f, 11.894f, 18.046f, 11.074f, 17.042f, 11.074f)
                close()
                moveTo(5.801f, 8.401f)
                curveTo(5.801f, 7.468f, 6.564f, 6.705f, 7.497f, 6.705f)
                curveTo(8.431f, 6.705f, 9.194f, 7.468f, 9.194f, 8.401f)
                curveTo(9.194f, 9.335f, 8.431f, 10.098f, 7.497f, 10.098f)
                curveTo(6.564f, 10.098f, 5.801f, 9.335f, 5.801f, 8.401f)
                close()
                moveTo(11.541f, 3.0f)
                curveTo(11.626f, 3.0f, 11.683f, 3.057f, 11.669f, 3.127f)
                verticalLineTo(20.859f)
                curveTo(11.669f, 20.929f, 11.612f, 20.986f, 11.541f, 20.986f)
                horizontalLineTo(7.611f)
                curveTo(5.065f, 20.986f, 3.001f, 18.921f, 3.001f, 16.376f)
                verticalLineTo(7.61f)
                curveTo(3.001f, 5.064f, 5.065f, 3.0f, 7.611f, 3.0f)
                horizontalLineTo(11.541f)
                close()
                moveTo(10.226f, 19.544f)
                verticalLineTo(4.442f)
                horizontalLineTo(7.611f)
                curveTo(6.762f, 4.442f, 5.97f, 4.782f, 5.376f, 5.375f)
                curveTo(4.768f, 5.969f, 4.443f, 6.761f, 4.443f, 7.61f)
                verticalLineTo(16.376f)
                curveTo(4.443f, 17.225f, 4.783f, 18.017f, 5.376f, 18.61f)
                curveTo(5.97f, 19.218f, 6.762f, 19.544f, 7.611f, 19.544f)
                horizontalLineTo(10.226f)
                close()
            }
        }
        .build()
        return _switchFill!!
    }

private var _switchFill: ImageVector? = null
