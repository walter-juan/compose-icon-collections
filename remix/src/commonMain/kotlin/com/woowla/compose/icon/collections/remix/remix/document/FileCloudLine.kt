package com.woowla.compose.icon.collections.remix.remix.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DocumentGroup

public val DocumentGroup.FileCloudLine: ImageVector
    get() {
        if (_fileCloudLine != null) {
            return _fileCloudLine!!
        }
        _fileCloudLine = Builder(name = "FileCloudLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.997f, 2.0f)
                lineTo(21.0f, 8.0f)
                lineTo(21.001f, 12.261f)
                curveTo(20.422f, 11.781f, 19.743f, 11.418f, 19.001f, 11.207f)
                lineTo(19.0f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                lineTo(10.059f, 20.001f)
                curveTo(10.176f, 20.736f, 10.462f, 21.417f, 10.877f, 22.001f)
                lineTo(3.993f, 22.0f)
                curveTo(3.484f, 22.0f, 3.064f, 21.617f, 3.007f, 21.124f)
                lineTo(3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.494f, 3.387f, 2.065f, 3.885f, 2.007f)
                lineTo(4.002f, 2.0f)
                horizontalLineTo(14.997f)
                close()
                moveTo(17.5f, 13.0f)
                curveTo(19.433f, 13.0f, 21.0f, 14.567f, 21.0f, 16.5f)
                lineTo(20.999f, 16.603f)
                curveTo(22.153f, 16.928f, 23.0f, 17.99f, 23.0f, 19.25f)
                curveTo(23.0f, 20.712f, 21.858f, 21.908f, 20.417f, 21.995f)
                lineTo(20.25f, 22.0f)
                horizontalLineTo(14.75f)
                lineTo(14.583f, 21.995f)
                curveTo(13.142f, 21.908f, 12.0f, 20.712f, 12.0f, 19.25f)
                curveTo(12.0f, 17.99f, 12.847f, 16.928f, 14.003f, 16.603f)
                lineTo(14.0f, 16.5f)
                curveTo(14.0f, 14.567f, 15.567f, 13.0f, 17.5f, 13.0f)
                close()
                moveTo(17.5f, 15.0f)
                curveTo(16.769f, 15.0f, 16.16f, 15.523f, 16.027f, 16.215f)
                lineTo(16.007f, 16.355f)
                lineTo(16.0f, 16.5f)
                verticalLineTo(18.12f)
                lineTo(14.556f, 18.526f)
                curveTo(14.156f, 18.633f, 13.918f, 19.044f, 14.026f, 19.444f)
                curveTo(14.105f, 19.74f, 14.351f, 19.948f, 14.636f, 19.992f)
                lineTo(14.745f, 20.0f)
                horizontalLineTo(20.255f)
                curveTo(20.585f, 19.998f, 20.885f, 19.778f, 20.974f, 19.444f)
                curveTo(21.082f, 19.044f, 20.844f, 18.633f, 20.444f, 18.526f)
                lineTo(19.432f, 18.243f)
                lineTo(19.0f, 18.12f)
                verticalLineTo(16.5f)
                lineTo(18.993f, 16.355f)
                curveTo(18.92f, 15.595f, 18.28f, 15.0f, 17.5f, 15.0f)
                close()
            }
        }
        .build()
        return _fileCloudLine!!
    }

private var _fileCloudLine: ImageVector? = null
