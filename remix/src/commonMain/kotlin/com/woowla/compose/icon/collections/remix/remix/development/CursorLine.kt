package com.woowla.compose.icon.collections.remix.remix.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DevelopmentGroup

public val DevelopmentGroup.CursorLine: ImageVector
    get() {
        if (_cursorLine != null) {
            return _cursorLine!!
        }
        _cursorLine = Builder(name = "CursorLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.387f, 13.498f)
                lineTo(17.94f, 20.512f)
                lineTo(13.242f, 22.222f)
                lineTo(10.689f, 15.208f)
                lineTo(6.79f, 17.653f)
                lineTo(8.409f, 1.633f)
                lineTo(19.946f, 12.865f)
                lineTo(15.387f, 13.498f)
                close()
                moveTo(15.377f, 19.316f)
                lineTo(12.662f, 11.857f)
                lineTo(15.621f, 11.446f)
                lineTo(9.982f, 5.956f)
                lineTo(9.191f, 13.786f)
                lineTo(11.722f, 12.199f)
                lineTo(14.437f, 19.658f)
                lineTo(15.377f, 19.316f)
                close()
            }
        }
        .build()
        return _cursorLine!!
    }

private var _cursorLine: ImageVector? = null
