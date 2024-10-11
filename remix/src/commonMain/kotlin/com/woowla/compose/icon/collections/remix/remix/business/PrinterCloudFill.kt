package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.PrinterCloudFill: ImageVector
    get() {
        if (_printerCloudFill != null) {
            return _printerCloudFill!!
        }
        _printerCloudFill = Builder(name = "PrinterCloudFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 2.0f, 18.0f, 2.448f, 18.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                curveTo(6.0f, 2.448f, 6.448f, 2.0f, 7.0f, 2.0f)
                close()
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 8.448f, 21.552f, 8.0f, 21.0f, 8.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 8.0f, 2.0f, 8.448f, 2.0f, 9.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.552f, 2.448f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.194f)
                curveTo(12.437f, 14.109f, 12.909f, 13.312f, 13.611f, 12.611f)
                curveTo(14.685f, 11.537f, 15.981f, 11.0f, 17.5f, 11.0f)
                curveTo(19.019f, 11.0f, 20.315f, 11.537f, 21.389f, 12.611f)
                curveTo(21.617f, 12.839f, 21.82f, 13.076f, 22.0f, 13.324f)
                verticalLineTo(9.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(21.0f, 16.5f)
                curveTo(21.0f, 14.567f, 19.433f, 13.0f, 17.5f, 13.0f)
                curveTo(15.567f, 13.0f, 14.0f, 14.567f, 14.0f, 16.5f)
                lineTo(14.003f, 16.603f)
                curveTo(12.847f, 16.928f, 12.0f, 17.99f, 12.0f, 19.25f)
                curveTo(12.0f, 20.712f, 13.142f, 21.908f, 14.583f, 21.995f)
                lineTo(14.75f, 22.0f)
                horizontalLineTo(20.25f)
                lineTo(20.417f, 21.995f)
                curveTo(21.858f, 21.908f, 23.0f, 20.712f, 23.0f, 19.25f)
                curveTo(23.0f, 17.99f, 22.153f, 16.928f, 20.999f, 16.603f)
                lineTo(21.0f, 16.5f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineTo(10.562f)
                curveTo(10.187f, 17.686f, 10.0f, 18.436f, 10.0f, 19.25f)
                curveTo(10.0f, 20.282f, 10.29f, 21.199f, 10.872f, 22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _printerCloudFill!!
    }

private var _printerCloudFill: ImageVector? = null
