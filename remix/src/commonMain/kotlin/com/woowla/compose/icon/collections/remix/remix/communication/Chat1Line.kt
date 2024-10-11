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

public val CommunicationGroup.Chat1Line: ImageVector
    get() {
        if (_chat1Line != null) {
            return _chat1Line!!
        }
        _chat1Line = Builder(name = "Chat1Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                horizontalLineTo(14.0f)
                curveTo(18.418f, 3.0f, 22.0f, 6.582f, 22.0f, 11.0f)
                curveTo(22.0f, 15.418f, 18.418f, 19.0f, 14.0f, 19.0f)
                verticalLineTo(22.5f)
                curveTo(9.0f, 20.5f, 2.0f, 17.5f, 2.0f, 11.0f)
                curveTo(2.0f, 6.582f, 5.582f, 3.0f, 10.0f, 3.0f)
                close()
                moveTo(12.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(17.314f, 17.0f, 20.0f, 14.314f, 20.0f, 11.0f)
                curveTo(20.0f, 7.686f, 17.314f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(10.0f)
                curveTo(6.686f, 5.0f, 4.0f, 7.686f, 4.0f, 11.0f)
                curveTo(4.0f, 14.61f, 6.462f, 16.966f, 12.0f, 19.48f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _chat1Line!!
    }

private var _chat1Line: ImageVector? = null
