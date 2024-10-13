package com.woowla.compose.icon.collections.devicons.devicons.trello

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TrelloGroup

public val TrelloGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0052cc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.89f, 0.0f)
                arcTo(12.86f, 12.86f, 0.0f, false, false, 0.0f, 12.89f)
                verticalLineToRelative(102.22f)
                arcTo(12.86f, 12.86f, 0.0f, false, false, 12.89f, 128.0f)
                horizontalLineToRelative(102.22f)
                arcTo(12.86f, 12.86f, 0.0f, false, false, 128.0f, 115.11f)
                lineTo(128.0f, 12.89f)
                arcTo(12.86f, 12.86f, 0.0f, false, false, 115.11f, 0.0f)
                close()
                moveTo(12.89f, 0.98f)
                horizontalLineToRelative(102.22f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, true, 11.9f, 11.9f)
                verticalLineToRelative(102.22f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, true, -11.9f, 11.9f)
                lineTo(12.89f, 127.02f)
                arcTo(11.87f, 11.87f, 0.0f, false, true, 0.98f, 115.11f)
                lineTo(0.98f, 12.89f)
                arcTo(11.87f, 11.87f, 0.0f, false, true, 12.89f, 0.98f)
                close()
                moveTo(22.96f, 16.5f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, false, -6.45f, 6.45f)
                lineTo(16.5f, 98.38f)
                curveToRelative(0.0f, 3.57f, 2.89f, 6.43f, 6.45f, 6.43f)
                horizontalLineToRelative(26.84f)
                arcToRelative(6.42f, 6.42f, 0.0f, false, false, 6.43f, -6.43f)
                lineTo(56.23f, 22.96f)
                curveToRelative(0.0f, -3.57f, -2.87f, -6.45f, -6.43f, -6.45f)
                close()
                moveTo(78.2f, 16.5f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, false, -6.45f, 6.45f)
                lineTo(71.75f, 66.62f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, false, 6.45f, 6.45f)
                horizontalLineToRelative(26.84f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, false, 6.45f, -6.45f)
                lineTo(111.5f, 22.96f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, false, -6.45f, -6.45f)
                close()
                moveTo(22.96f, 17.51f)
                horizontalLineToRelative(26.84f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, 5.45f, 5.45f)
                lineTo(55.25f, 98.38f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -5.45f, 5.45f)
                lineTo(22.96f, 103.83f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -5.45f, -5.45f)
                lineTo(17.51f, 22.96f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, 5.45f, -5.45f)
                close()
                moveTo(78.2f, 17.51f)
                horizontalLineToRelative(26.84f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, 5.45f, 5.45f)
                verticalLineToRelative(43.66f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -5.45f, 5.45f)
                horizontalLineToRelative(-26.84f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, -5.45f, -5.45f)
                lineTo(72.75f, 22.96f)
                arcToRelative(5.42f, 5.42f, 0.0f, false, true, 5.45f, -5.45f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
