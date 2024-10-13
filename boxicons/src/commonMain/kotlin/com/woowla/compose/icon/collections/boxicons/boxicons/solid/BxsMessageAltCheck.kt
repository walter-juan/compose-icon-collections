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

public val SolidGroup.BxsMessageAltCheck: ImageVector
    get() {
        if (_bxsMessageAltCheck != null) {
            return _bxsMessageAltCheck!!
        }
        _bxsMessageAltCheck = Builder(name = "BxsMessageAltCheck", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(3.5f, 4.0f)
                lineToRelative(3.5f, -4.0f)
                lineTo(19.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                close()
                moveTo(8.707f, 8.293f)
                lineTo(11.0f, 10.586f)
                lineToRelative(4.793f, -4.793f)
                lineToRelative(1.414f, 1.414f)
                lineTo(11.0f, 13.414f)
                lineTo(7.293f, 9.707f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _bxsMessageAltCheck!!
    }

private var _bxsMessageAltCheck: ImageVector? = null
