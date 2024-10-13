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

public val RegularGroup.BxArrowToBottom: ImageVector
    get() {
        if (_bxArrowToBottom != null) {
            return _bxArrowToBottom!!
        }
        _bxArrowToBottom = Builder(name = "BxArrowToBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(11.0f, 4.0f)
                verticalLineToRelative(8.586f)
                lineTo(6.707f, 8.293f)
                lineTo(5.293f, 9.707f)
                lineTo(12.0f, 16.414f)
                lineToRelative(6.707f, -6.707f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(13.0f, 12.586f)
                lineTo(13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxArrowToBottom!!
    }

private var _bxArrowToBottom: ImageVector? = null
