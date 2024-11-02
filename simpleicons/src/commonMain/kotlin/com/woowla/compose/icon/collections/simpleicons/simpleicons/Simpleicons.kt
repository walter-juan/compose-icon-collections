package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Simpleicons: ImageVector
    get() {
        if (_simpleicons != null) {
            return _simpleicons!!
        }
        _simpleicons = Builder(name = "Simpleicons", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.688f, 0.0f, 6.0f, 2.688f, 6.0f, 6.0f)
                reflectiveCurveToRelative(2.688f, 6.0f, 6.0f, 6.0f)
                curveToRelative(4.64f, -0.001f, 7.526f, 5.039f, 5.176f, 9.04f)
                horizontalLineToRelative(1.68f)
                arcTo(7.507f, 7.507f, 0.0f, false, false, 12.0f, 10.5f)
                arcTo(4.502f, 4.502f, 0.0f, false, true, 7.5f, 6.0f)
                curveToRelative(0.0f, -2.484f, 2.016f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.016f, 4.5f, 4.5f)
                lineTo(18.0f, 6.0f)
                curveToRelative(0.0f, -3.312f, -2.688f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                curveToRelative(4.0f, 0.0f, 4.0f, -6.0f, 0.0f, -6.0f)
                close()
                moveTo(12.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 6.0f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.002f, 1.336f, -1.617f, 2.003f, -2.561f, 1.058f)
                curveTo(9.995f, 6.115f, 10.664f, 4.5f, 12.0f, 4.5f)
                close()
                moveTo(7.5f, 15.0f)
                verticalLineToRelative(1.5f)
                lineTo(9.0f, 16.5f)
                verticalLineToRelative(6.0f)
                lineTo(4.5f, 22.5f)
                lineTo(4.5f, 24.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.5f)
                lineTo(15.0f, 22.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                lineTo(16.5f, 15.0f)
                close()
                moveTo(10.5f, 16.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(4.5f, 17.97f)
                curveToRelative(0.0f, 1.09f, 0.216f, 2.109f, 0.644f, 3.069f)
                horizontalLineToRelative(1.684f)
                arcTo(5.957f, 5.957f, 0.0f, false, true, 6.0f, 17.97f)
                close()
            }
        }
        .build()
        return _simpleicons!!
    }

private var _simpleicons: ImageVector? = null
