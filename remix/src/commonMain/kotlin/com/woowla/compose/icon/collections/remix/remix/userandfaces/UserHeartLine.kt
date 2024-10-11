package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.UserHeartLine: ImageVector
    get() {
        if (_userHeartLine != null) {
            return _userHeartLine!!
        }
        _userHeartLine = Builder(name = "UserHeartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.841f, 15.659f)
                lineTo(18.017f, 15.836f)
                lineTo(18.194f, 15.659f)
                curveTo(19.073f, 14.78f, 20.498f, 14.78f, 21.376f, 15.659f)
                curveTo(22.255f, 16.538f, 22.255f, 17.962f, 21.376f, 18.841f)
                lineTo(18.018f, 22.2f)
                lineTo(14.659f, 18.841f)
                curveTo(13.78f, 17.962f, 13.78f, 16.538f, 14.659f, 15.659f)
                curveTo(15.538f, 14.78f, 16.962f, 14.78f, 17.841f, 15.659f)
                close()
                moveTo(12.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(8.686f, 16.0f, 6.0f, 18.686f, 6.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.665f, 7.448f, 14.135f, 11.751f, 14.004f)
                lineTo(12.0f, 14.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.24f, 15.436f, 12.878f, 12.225f, 12.996f)
                lineTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.76f, 8.564f, 1.122f, 11.775f, 1.004f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(9.79f, 3.0f, 8.0f, 4.79f, 8.0f, 7.0f)
                curveTo(8.0f, 9.21f, 9.79f, 11.0f, 12.0f, 11.0f)
                curveTo(14.21f, 11.0f, 16.0f, 9.21f, 16.0f, 7.0f)
                curveTo(16.0f, 4.79f, 14.21f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _userHeartLine!!
    }

private var _userHeartLine: ImageVector? = null
