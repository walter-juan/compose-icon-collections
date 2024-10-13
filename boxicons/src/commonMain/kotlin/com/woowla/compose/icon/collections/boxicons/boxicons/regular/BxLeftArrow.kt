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

public val RegularGroup.BxLeftArrow: ImageVector
    get() {
        if (_bxLeftArrow != null) {
            return _bxLeftArrow!!
        }
        _bxLeftArrow = Builder(name = "BxLeftArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.464f, 2.114f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -1.033f, 0.063f)
                lineToRelative(-13.0f, 9.0f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, false, 0.0f, 1.645f)
                lineToRelative(13.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 21.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.536f, -0.886f)
                close()
                moveTo(17.0f, 19.091f)
                lineTo(6.757f, 12.0f)
                lineTo(17.0f, 4.909f)
                verticalLineToRelative(14.182f)
                close()
            }
        }
        .build()
        return _bxLeftArrow!!
    }

private var _bxLeftArrow: ImageVector? = null
