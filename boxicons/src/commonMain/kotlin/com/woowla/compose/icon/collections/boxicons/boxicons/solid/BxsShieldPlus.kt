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

public val SolidGroup.BxsShieldPlus: ImageVector
    get() {
        if (_bxsShieldPlus != null) {
            return _bxsShieldPlus!!
        }
        _bxsShieldPlus = Builder(name = "BxsShieldPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.43f, 5.76f)
                lineToRelative(-8.0f, -3.56f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.82f, 0.0f)
                lineToRelative(-8.0f, 3.56f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.59f, 0.9f)
                curveToRelative(0.0f, 2.37f, 0.44f, 10.8f, 8.51f, 15.11f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
                curveToRelative(8.0f, -4.3f, 8.58f, -12.71f, 8.57f, -15.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.67f, -0.91f)
                close()
                moveTo(16.0f, 12.76f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 12.76f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bxsShieldPlus!!
    }

private var _bxsShieldPlus: ImageVector? = null
