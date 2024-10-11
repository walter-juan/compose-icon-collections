package com.woowla.compose.icon.collections.remix.remix.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.EditorGroup

public val EditorGroup.SlashCommands2: ImageVector
    get() {
        if (_slashCommands2 != null) {
            return _slashCommands2!!
        }
        _slashCommands2 = Builder(name = "SlashCommands2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                curveTo(3.343f, 2.0f, 2.0f, 3.343f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.657f, 3.343f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 22.0f, 22.0f, 20.657f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.343f, 20.657f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(4.0f, 5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 4.0f, 20.0f, 4.448f, 20.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 19.552f, 19.552f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 20.0f, 4.0f, 19.552f, 4.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.723f, 18.0f)
                lineTo(16.58f, 6.0f)
                horizontalLineTo(14.277f)
                lineTo(7.42f, 18.0f)
                horizontalLineTo(9.723f)
                close()
            }
        }
        .build()
        return _slashCommands2!!
    }

private var _slashCommands2: ImageVector? = null
