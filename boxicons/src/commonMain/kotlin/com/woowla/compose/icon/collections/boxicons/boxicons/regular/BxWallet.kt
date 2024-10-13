package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxWallet: ImageVector
    get() {
        if (_bxWallet != null) {
            return _bxWallet!!
        }
        _bxWallet = Builder(name = "BxWallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 3.0f)
                curveTo(3.346f, 3.0f, 2.0f, 4.346f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.201f, 1.794f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 7.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(5.012f, 19.0f)
                curveTo(4.55f, 18.988f, 4.0f, 18.805f, 4.0f, 18.0f)
                lineTo(4.0f, 8.815f)
                curveToRelative(0.314f, 0.113f, 0.647f, 0.185f, 1.0f, 0.185f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _bxWallet!!
    }

private var _bxWallet: ImageVector? = null
