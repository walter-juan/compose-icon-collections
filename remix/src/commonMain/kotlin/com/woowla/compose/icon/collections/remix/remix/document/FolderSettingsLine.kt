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

public val DocumentGroup.FolderSettingsLine: ImageVector
    get() {
        if (_folderSettingsLine != null) {
            return _folderSettingsLine!!
        }
        _folderSettingsLine = Builder(name = "FolderSettingsLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.414f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 5.0f, 22.0f, 5.448f, 22.0f, 6.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(10.414f)
                lineTo(12.414f, 5.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.586f)
                lineTo(9.586f, 5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(8.591f, 13.809f)
                curveTo(8.529f, 13.549f, 8.497f, 13.277f, 8.497f, 12.998f)
                curveTo(8.497f, 12.719f, 8.529f, 12.447f, 8.591f, 12.187f)
                lineTo(7.6f, 11.615f)
                lineTo(8.599f, 9.883f)
                lineTo(9.591f, 10.456f)
                curveTo(9.984f, 10.084f, 10.463f, 9.803f, 10.995f, 9.644f)
                verticalLineTo(8.5f)
                horizontalLineTo(12.994f)
                verticalLineTo(9.644f)
                curveTo(13.526f, 9.803f, 14.006f, 10.084f, 14.399f, 10.456f)
                lineTo(15.39f, 9.883f)
                lineTo(16.39f, 11.615f)
                lineTo(15.399f, 12.187f)
                curveTo(15.46f, 12.447f, 15.493f, 12.719f, 15.493f, 12.998f)
                curveTo(15.493f, 13.277f, 15.46f, 13.549f, 15.399f, 13.809f)
                lineTo(16.39f, 14.381f)
                lineTo(15.391f, 16.112f)
                lineTo(14.399f, 15.54f)
                curveTo(14.006f, 15.911f, 13.527f, 16.193f, 12.995f, 16.351f)
                verticalLineTo(17.496f)
                horizontalLineTo(10.995f)
                verticalLineTo(16.351f)
                curveTo(10.463f, 16.193f, 9.984f, 15.911f, 9.591f, 15.54f)
                lineTo(8.6f, 16.112f)
                lineTo(7.6f, 14.381f)
                lineTo(8.591f, 13.809f)
                close()
                moveTo(11.995f, 14.497f)
                curveTo(12.823f, 14.497f, 13.494f, 13.826f, 13.494f, 12.998f)
                curveTo(13.494f, 12.17f, 12.823f, 11.498f, 11.995f, 11.498f)
                curveTo(11.167f, 11.498f, 10.496f, 12.17f, 10.496f, 12.998f)
                curveTo(10.496f, 13.826f, 11.167f, 14.497f, 11.995f, 14.497f)
                close()
            }
        }
        .build()
        return _folderSettingsLine!!
    }

private var _folderSettingsLine: ImageVector? = null
