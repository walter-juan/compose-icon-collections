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

public val RegularGroup.BxRightArrow: ImageVector
    get() {
        if (_bxRightArrow != null) {
            return _bxRightArrow!!
        }
        _bxRightArrow = Builder(name = "BxRightArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.536f, 21.886f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, 1.033f, -0.064f)
                lineToRelative(13.0f, -9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.644f)
                lineToRelative(-13.0f, -9.0f)
                arcTo(0.998f, 0.998f, 0.0f, false, false, 5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.536f, 0.886f)
                close()
                moveTo(7.0f, 4.909f)
                lineTo(17.243f, 12.0f)
                lineTo(7.0f, 19.091f)
                verticalLineTo(4.909f)
                close()
            }
        }
        .build()
        return _bxRightArrow!!
    }

private var _bxRightArrow: ImageVector? = null
