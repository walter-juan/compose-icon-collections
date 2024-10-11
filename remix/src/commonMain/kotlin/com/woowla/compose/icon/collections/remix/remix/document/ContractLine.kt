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

public val DocumentGroup.ContractLine: ImageVector
    get() {
        if (_contractLine != null) {
            return _contractLine!!
        }
        _contractLine = Builder(name = "ContractLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.455f, 3.449f, 2.0f, 4.002f, 2.0f)
                horizontalLineTo(14.997f)
                lineTo(21.0f, 8.0f)
                close()
                moveTo(13.786f, 15.327f)
                curveTo(13.825f, 14.6f, 14.386f, 14.008f, 15.11f, 13.931f)
                lineTo(15.981f, 13.839f)
                curveTo(16.084f, 13.828f, 16.181f, 13.785f, 16.259f, 13.715f)
                lineTo(16.91f, 13.13f)
                curveTo(17.452f, 12.643f, 18.267f, 12.622f, 18.833f, 13.08f)
                lineTo(19.514f, 13.63f)
                curveTo(19.595f, 13.695f, 19.695f, 13.733f, 19.799f, 13.739f)
                lineTo(20.673f, 13.786f)
                curveTo(21.4f, 13.825f, 21.992f, 14.386f, 22.069f, 15.11f)
                lineTo(22.161f, 15.981f)
                curveTo(22.172f, 16.084f, 22.215f, 16.181f, 22.285f, 16.259f)
                lineTo(22.87f, 16.91f)
                curveTo(23.357f, 17.452f, 23.378f, 18.267f, 22.92f, 18.833f)
                lineTo(22.37f, 19.514f)
                curveTo(22.305f, 19.595f, 22.267f, 19.695f, 22.261f, 19.799f)
                lineTo(22.214f, 20.673f)
                curveTo(22.175f, 21.4f, 21.614f, 21.992f, 20.89f, 22.069f)
                lineTo(20.019f, 22.161f)
                curveTo(19.916f, 22.172f, 19.819f, 22.215f, 19.741f, 22.285f)
                lineTo(19.09f, 22.87f)
                curveTo(18.548f, 23.357f, 17.733f, 23.378f, 17.167f, 22.92f)
                lineTo(16.486f, 22.37f)
                curveTo(16.405f, 22.305f, 16.305f, 22.267f, 16.201f, 22.261f)
                lineTo(15.327f, 22.214f)
                curveTo(14.6f, 22.175f, 14.008f, 21.614f, 13.931f, 20.89f)
                lineTo(13.839f, 20.019f)
                curveTo(13.828f, 19.916f, 13.785f, 19.819f, 13.715f, 19.741f)
                lineTo(13.13f, 19.09f)
                curveTo(12.643f, 18.548f, 12.622f, 17.733f, 13.08f, 17.167f)
                lineTo(13.63f, 16.486f)
                curveTo(13.695f, 16.405f, 13.733f, 16.305f, 13.739f, 16.201f)
                lineTo(13.786f, 15.327f)
                close()
                moveTo(21.03f, 17.03f)
                lineTo(19.97f, 15.97f)
                lineTo(17.5f, 18.439f)
                lineTo(16.03f, 16.97f)
                lineTo(14.97f, 18.03f)
                lineTo(17.5f, 20.561f)
                lineTo(21.03f, 17.03f)
                close()
            }
        }
        .build()
        return _contractLine!!
    }

private var _contractLine: ImageVector? = null
