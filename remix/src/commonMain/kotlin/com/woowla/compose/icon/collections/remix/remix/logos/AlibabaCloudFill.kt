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

public val LogosGroup.AlibabaCloudFill: ImageVector
    get() {
        if (_alibabaCloudFill != null) {
            return _alibabaCloudFill!!
        }
        _alibabaCloudFill = Builder(name = "AlibabaCloudFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.514f, 5.14f)
                horizontalLineTo(4.68f)
                curveTo(3.704f, 5.14f, 2.768f, 5.528f, 2.078f, 6.218f)
                curveTo(1.388f, 6.908f, 1.0f, 7.844f, 1.0f, 8.82f)
                verticalLineTo(15.178f)
                curveTo(1.0f, 16.154f, 1.388f, 17.09f, 2.078f, 17.78f)
                curveTo(2.768f, 18.47f, 3.704f, 18.857f, 4.68f, 18.857f)
                horizontalLineTo(9.529f)
                lineTo(8.359f, 17.201f)
                lineTo(4.823f, 16.12f)
                curveTo(4.511f, 16.02f, 4.239f, 15.824f, 4.047f, 15.559f)
                curveTo(3.854f, 15.295f, 3.751f, 14.975f, 3.752f, 14.648f)
                verticalLineTo(9.371f)
                curveTo(3.75f, 9.044f, 3.852f, 8.724f, 4.045f, 8.459f)
                curveTo(4.238f, 8.194f, 4.511f, 7.998f, 4.823f, 7.9f)
                lineTo(8.359f, 6.796f)
                lineTo(9.514f, 5.14f)
                close()
                moveTo(19.339f, 5.14f)
                horizontalLineTo(14.489f)
                lineTo(15.659f, 6.796f)
                lineTo(19.195f, 7.9f)
                curveTo(19.507f, 7.998f, 19.78f, 8.194f, 19.972f, 8.459f)
                curveTo(20.164f, 8.724f, 20.266f, 9.044f, 20.262f, 9.371f)
                verticalLineTo(14.648f)
                curveTo(20.265f, 14.975f, 20.162f, 15.294f, 19.97f, 15.559f)
                curveTo(19.778f, 15.824f, 19.507f, 16.02f, 19.195f, 16.12f)
                lineTo(15.659f, 17.201f)
                lineTo(14.489f, 18.857f)
                horizontalLineTo(19.339f)
                curveTo(19.821f, 18.858f, 20.299f, 18.763f, 20.745f, 18.578f)
                curveTo(21.19f, 18.393f, 21.595f, 18.122f, 21.935f, 17.78f)
                curveTo(22.275f, 17.438f, 22.545f, 17.032f, 22.728f, 16.585f)
                curveTo(22.91f, 16.139f, 23.003f, 15.66f, 23.0f, 15.178f)
                verticalLineTo(8.82f)
                curveTo(23.0f, 7.847f, 22.615f, 6.914f, 21.929f, 6.224f)
                curveTo(21.243f, 5.535f, 20.312f, 5.145f, 19.339f, 5.14f)
                close()
                moveTo(15.667f, 11.138f)
                horizontalLineTo(8.337f)
                verticalLineTo(12.79f)
                horizontalLineTo(15.667f)
                verticalLineTo(11.138f)
                close()
            }
        }
        .build()
        return _alibabaCloudFill!!
    }

private var _alibabaCloudFill: ImageVector? = null
