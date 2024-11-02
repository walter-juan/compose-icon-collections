package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Topdotgg: ImageVector
    get() {
        if (_topdotgg != null) {
            return _topdotgg!!
        }
        _topdotgg = Builder(name = "Topdotgg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.378f)
                horizontalLineToRelative(7.622f)
                lineTo(7.622f, 12.0f)
                lineTo(2.329f, 12.0f)
                arcTo(2.321f, 2.321f, 0.0f, false, true, 0.008f, 9.679f)
                close()
                moveTo(24.0f, 4.378f)
                lineTo(8.757f, 4.378f)
                verticalLineToRelative(15.243f)
                horizontalLineToRelative(3.114f)
                arcToRelative(4.507f, 4.507f, 0.0f, false, false, 4.507f, -4.507f)
                lineTo(16.378f, 12.0f)
                horizontalLineToRelative(3.115f)
                arcTo(4.507f, 4.507f, 0.0f, false, false, 24.0f, 7.493f)
                close()
            }
        }
        .build()
        return _topdotgg!!
    }

private var _topdotgg: ImageVector? = null
