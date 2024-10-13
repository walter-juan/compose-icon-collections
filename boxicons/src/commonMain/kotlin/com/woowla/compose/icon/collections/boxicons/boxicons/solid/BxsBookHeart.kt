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

public val SolidGroup.BxsBookHeart: ImageVector
    get() {
        if (_bxsBookHeart != null) {
            return _bxsBookHeart!!
        }
        _bxsBookHeart = Builder(name = "BxsBookHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.012f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.206f, 0.0f, -3.0f, 0.799f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.201f, 1.794f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.012f)
                curveTo(5.55f, 19.988f, 5.0f, 19.806f, 5.0f, 19.0f)
                curveToRelative(0.0f, -0.101f, 0.009f, -0.191f, 0.024f, -0.273f)
                curveToRelative(0.112f, -0.576f, 0.584f, -0.717f, 0.988f, -0.727f)
                close()
                moveTo(8.648f, 7.642f)
                arcToRelative(2.224f, 2.224f, 0.0f, false, true, 3.125f, 0.0f)
                lineToRelative(0.224f, 0.219f)
                lineToRelative(0.223f, -0.219f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, 3.126f, 0.0f)
                arcToRelative(2.129f, 2.129f, 0.0f, false, true, 0.0f, 3.069f)
                lineTo(11.998f, 14.0f)
                lineToRelative(-3.349f, -3.289f)
                arcToRelative(2.128f, 2.128f, 0.0f, false, true, -0.001f, -3.069f)
                close()
            }
        }
        .build()
        return _bxsBookHeart!!
    }

private var _bxsBookHeart: ImageVector? = null
