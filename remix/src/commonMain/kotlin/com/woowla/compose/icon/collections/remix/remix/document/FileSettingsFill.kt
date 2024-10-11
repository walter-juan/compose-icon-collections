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

public val DocumentGroup.FileSettingsFill: ImageVector
    get() {
        if (_fileSettingsFill != null) {
            return _fileSettingsFill!!
        }
        _fileSettingsFill = Builder(name = "FileSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.008f)
                curveTo(21.0f, 21.556f, 20.555f, 22.0f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0f, 21.545f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.595f, 12.811f)
                lineTo(7.603f, 13.384f)
                lineTo(8.603f, 15.116f)
                lineTo(9.595f, 14.543f)
                curveTo(9.988f, 14.915f, 10.468f, 15.197f, 11.0f, 15.355f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.355f)
                curveTo(13.533f, 15.197f, 14.012f, 14.915f, 14.405f, 14.543f)
                lineTo(15.397f, 15.116f)
                lineTo(16.397f, 13.384f)
                lineTo(15.406f, 12.811f)
                curveTo(15.467f, 12.551f, 15.5f, 12.279f, 15.5f, 12.0f)
                curveTo(15.5f, 11.721f, 15.467f, 11.449f, 15.405f, 11.189f)
                lineTo(16.397f, 10.616f)
                lineTo(15.397f, 8.884f)
                lineTo(14.405f, 9.457f)
                curveTo(14.012f, 9.085f, 13.532f, 8.803f, 13.0f, 8.645f)
                verticalLineTo(7.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.645f)
                curveTo(10.468f, 8.803f, 9.988f, 9.085f, 9.595f, 9.457f)
                lineTo(8.603f, 8.884f)
                lineTo(7.603f, 10.616f)
                lineTo(8.595f, 11.189f)
                curveTo(8.533f, 11.449f, 8.5f, 11.721f, 8.5f, 12.0f)
                curveTo(8.5f, 12.279f, 8.533f, 12.551f, 8.595f, 12.811f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12.0f)
                curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12.0f, 10.5f)
                curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12.0f)
                curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _fileSettingsFill!!
    }

private var _fileSettingsFill: ImageVector? = null
