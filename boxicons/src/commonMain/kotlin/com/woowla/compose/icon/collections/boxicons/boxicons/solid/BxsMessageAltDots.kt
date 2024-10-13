package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsMessageAltDots: ImageVector
    get() {
        if (_bxsMessageAltDots != null) {
            return _bxsMessageAltDots!!
        }
        _bxsMessageAltDots = Builder(name = "BxsMessageAltDots", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(3.5f, 4.0f)
                lineToRelative(3.5f, -4.0f)
                lineTo(19.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(9.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 12.0f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.001f, -4.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _bxsMessageAltDots!!
    }

private var _bxsMessageAltDots: ImageVector? = null
