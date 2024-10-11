package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.UploadCloudLine: ImageVector
    get() {
        if (_uploadCloudLine != null) {
            return _uploadCloudLine!!
        }
        _uploadCloudLine = Builder(name = "UploadCloudLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 14.5f)
                curveTo(1.0f, 12.172f, 2.224f, 10.129f, 4.064f, 8.981f)
                curveTo(4.565f, 5.044f, 7.927f, 2.0f, 12.0f, 2.0f)
                curveTo(16.073f, 2.0f, 19.435f, 5.044f, 19.936f, 8.981f)
                curveTo(21.776f, 10.129f, 23.0f, 12.172f, 23.0f, 14.5f)
                curveTo(23.0f, 17.922f, 20.356f, 20.726f, 17.0f, 20.981f)
                lineTo(7.0f, 21.0f)
                curveTo(3.644f, 20.726f, 1.0f, 17.922f, 1.0f, 14.5f)
                close()
                moveTo(16.848f, 18.987f)
                curveTo(19.182f, 18.809f, 21.0f, 16.856f, 21.0f, 14.5f)
                curveTo(21.0f, 12.927f, 20.188f, 11.496f, 18.877f, 10.678f)
                lineTo(18.071f, 10.175f)
                lineTo(17.952f, 9.233f)
                curveTo(17.573f, 6.258f, 15.029f, 4.0f, 12.0f, 4.0f)
                curveTo(8.971f, 4.0f, 6.426f, 6.258f, 6.048f, 9.233f)
                lineTo(5.929f, 10.175f)
                lineTo(5.123f, 10.678f)
                curveTo(3.812f, 11.496f, 3.0f, 12.927f, 3.0f, 14.5f)
                curveTo(3.0f, 16.856f, 4.818f, 18.809f, 7.152f, 18.987f)
                lineTo(7.325f, 19.0f)
                horizontalLineTo(16.675f)
                lineTo(16.848f, 18.987f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 8.0f)
                lineTo(16.0f, 13.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _uploadCloudLine!!
    }

private var _uploadCloudLine: ImageVector? = null
