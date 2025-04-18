package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.Message3Line: ImageVector
    get() {
        if (_message3Line != null) {
            return _message3Line!!
        }
        _message3Line = Builder(name = "Message3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.994f)
                curveTo(2.0f, 5.683f, 4.677f, 3.0f, 8.001f, 3.0f)
                horizontalLineTo(15.999f)
                curveTo(19.313f, 3.0f, 22.0f, 5.695f, 22.0f, 8.994f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.001f)
                curveTo(4.687f, 21.0f, 2.0f, 18.305f, 2.0f, 15.006f)
                verticalLineTo(8.994f)
                close()
                moveTo(20.0f, 19.0f)
                verticalLineTo(8.994f)
                curveTo(20.0f, 6.795f, 18.205f, 5.0f, 15.999f, 5.0f)
                horizontalLineTo(8.001f)
                curveTo(5.785f, 5.0f, 4.0f, 6.785f, 4.0f, 8.994f)
                verticalLineTo(15.006f)
                curveTo(4.0f, 17.205f, 5.795f, 19.0f, 8.001f, 19.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _message3Line!!
    }

private var _message3Line: ImageVector? = null
