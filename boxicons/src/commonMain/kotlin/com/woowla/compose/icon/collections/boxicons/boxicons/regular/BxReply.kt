package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxReply: ImageVector
    get() {
        if (_bxReply != null) {
            return _bxReply!!
        }
        _bxReply = Builder(name = "BxReply", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(6.0f)
                lineToRelative(-5.0f, 4.0f)
                lineToRelative(5.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bxReply!!
    }

private var _bxReply: ImageVector? = null
