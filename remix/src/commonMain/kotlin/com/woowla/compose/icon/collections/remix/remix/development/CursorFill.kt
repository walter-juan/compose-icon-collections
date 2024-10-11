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

public val DevelopmentGroup.CursorFill: ImageVector
    get() {
        if (_cursorFill != null) {
            return _cursorFill!!
        }
        _cursorFill = Builder(name = "CursorFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.909f, 12.36f)
                lineTo(17.001f, 20.854f)
                lineTo(14.182f, 21.88f)
                lineTo(11.09f, 13.386f)
                lineTo(6.918f, 16.542f)
                lineTo(8.409f, 1.633f)
                lineTo(19.134f, 12.096f)
                lineTo(13.909f, 12.36f)
                close()
            }
        }
        .build()
        return _cursorFill!!
    }

private var _cursorFill: ImageVector? = null
