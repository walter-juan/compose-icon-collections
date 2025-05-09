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

public val DevelopmentGroup.TerminalBoxFill: ImageVector
    get() {
        if (_terminalBoxFill != null) {
            return _terminalBoxFill!!
        }
        _terminalBoxFill = Builder(name = "TerminalBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(12.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(8.414f, 12.0f)
                lineTo(5.586f, 14.828f)
                lineTo(7.0f, 16.243f)
                lineTo(11.243f, 12.0f)
                lineTo(7.0f, 7.757f)
                lineTo(5.586f, 9.172f)
                lineTo(8.414f, 12.0f)
                close()
            }
        }
        .build()
        return _terminalBoxFill!!
    }

private var _terminalBoxFill: ImageVector? = null
