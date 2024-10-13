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

public val SolidGroup.BxsMessageDots: ImageVector
    get() {
        if (_bxsMessageDots != null) {
            return _bxsMessageDots!!
        }
        _bxsMessageDots = Builder(name = "BxsMessageDots", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                lineTo(4.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.894f, -2.0f, 1.992f)
                verticalLineToRelative(12.017f)
                curveTo(2.0f, 17.106f, 2.897f, 18.0f, 4.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(6.351f, -4.0f)
                lineTo(20.0f, 18.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.894f, 2.0f, -1.992f)
                lineTo(22.0f, 3.992f)
                arcTo(1.998f, 1.998f, 0.0f, false, false, 20.0f, 2.0f)
                close()
                moveTo(11.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                curveToRelative(0.086f, 0.0f, 0.167f, 0.015f, 0.25f, 0.025f)
                curveToRelative(0.082f, -0.014f, 0.164f, -0.025f, 0.25f, -0.025f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 9.5f)
                curveToRelative(0.0f, 0.086f, -0.012f, 0.168f, -0.025f, 0.25f)
                curveToRelative(0.01f, 0.083f, 0.025f, 0.165f, 0.025f, 0.25f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.086f, 0.015f, -0.167f, 0.025f, -0.25f)
                arcTo(1.592f, 1.592f, 0.0f, false, true, 13.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 8.0f)
                curveToRelative(0.086f, 0.0f, 0.168f, 0.011f, 0.25f, 0.025f)
                curveToRelative(0.083f, -0.01f, 0.164f, -0.025f, 0.25f, -0.025f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxsMessageDots!!
    }

private var _bxsMessageDots: ImageVector? = null
