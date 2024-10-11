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

public val CommunicationGroup.Chat2Line: ImageVector
    get() {
        if (_chat2Line != null) {
            return _chat2Line!!
        }
        _chat2Line = Builder(name = "Chat2Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.45f, 19.0f)
                lineTo(12.0f, 22.5f)
                lineTo(9.55f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.735f, 19.0f, 2.48f, 18.895f, 2.293f, 18.707f)
                curveTo(2.105f, 18.52f, 2.0f, 18.265f, 2.0f, 18.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.735f, 2.105f, 3.48f, 2.293f, 3.293f)
                curveTo(2.48f, 3.105f, 2.735f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.265f, 3.0f, 21.52f, 3.105f, 21.707f, 3.293f)
                curveTo(21.895f, 3.48f, 22.0f, 3.735f, 22.0f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.265f, 21.895f, 18.52f, 21.707f, 18.707f)
                curveTo(21.52f, 18.895f, 21.265f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(14.45f)
                close()
                moveTo(13.409f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.591f)
                lineTo(12.0f, 19.012f)
                lineTo(13.409f, 17.0f)
                close()
            }
        }
        .build()
        return _chat2Line!!
    }

private var _chat2Line: ImageVector? = null
