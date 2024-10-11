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

public val UserAndFacesGroup.UserVoiceFill: ImageVector
    get() {
        if (_userVoiceFill != null) {
            return _userVoiceFill!!
        }
        _userVoiceFill = Builder(name = "UserVoiceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 22.0f)
                curveTo(1.0f, 17.582f, 4.582f, 14.0f, 9.0f, 14.0f)
                curveTo(13.418f, 14.0f, 17.0f, 17.582f, 17.0f, 22.0f)
                horizontalLineTo(1.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveTo(5.685f, 13.0f, 3.0f, 10.315f, 3.0f, 7.0f)
                curveTo(3.0f, 3.685f, 5.685f, 1.0f, 9.0f, 1.0f)
                curveTo(12.315f, 1.0f, 15.0f, 3.685f, 15.0f, 7.0f)
                curveTo(15.0f, 10.315f, 12.315f, 13.0f, 9.0f, 13.0f)
                close()
                moveTo(18.246f, 3.185f)
                curveTo(18.732f, 4.36f, 19.0f, 5.649f, 19.0f, 7.0f)
                curveTo(19.0f, 8.351f, 18.732f, 9.64f, 18.246f, 10.816f)
                lineTo(16.569f, 9.596f)
                curveTo(16.848f, 8.782f, 17.0f, 7.909f, 17.0f, 7.0f)
                curveTo(17.0f, 6.091f, 16.848f, 5.218f, 16.569f, 4.404f)
                lineTo(18.246f, 3.185f)
                close()
                moveTo(21.548f, 0.784f)
                curveTo(22.477f, 2.657f, 23.0f, 4.767f, 23.0f, 7.0f)
                curveTo(23.0f, 9.233f, 22.477f, 11.344f, 21.548f, 13.217f)
                lineTo(19.903f, 12.02f)
                curveTo(20.607f, 10.493f, 21.0f, 8.792f, 21.0f, 7.0f)
                curveTo(21.0f, 5.208f, 20.607f, 3.507f, 19.903f, 1.98f)
                lineTo(21.548f, 0.784f)
                close()
            }
        }
        .build()
        return _userVoiceFill!!
    }

private var _userVoiceFill: ImageVector? = null
