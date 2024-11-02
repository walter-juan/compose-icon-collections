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

public val Simpleicons.Datev: ImageVector
    get() {
        if (_datev != null) {
            return _datev!!
        }
        _datev = Builder(name = "Datev", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.165f)
                verticalLineToRelative(16.917f)
                horizontalLineToRelative(23.915f)
                lineTo(23.915f, 0.165f)
                close()
                moveTo(0.017f, 18.349f)
                verticalLineToRelative(5.486f)
                horizontalLineToRelative(1.981f)
                curveToRelative(1.475f, 0.0f, 2.743f, -1.183f, 2.743f, -2.701f)
                curveToRelative(-0.042f, -1.686f, -1.098f, -2.785f, -2.574f, -2.785f)
                close()
                moveTo(6.637f, 18.349f)
                lineTo(4.529f, 23.835f)
                lineTo(5.706f, 23.835f)
                lineToRelative(1.642f, -4.343f)
                lineToRelative(1.355f, 3.454f)
                horizontalLineToRelative(-1.524f)
                verticalLineToRelative(0.889f)
                horizontalLineToRelative(3.039f)
                lineToRelative(-2.15f, -5.486f)
                close()
                moveTo(9.287f, 18.349f)
                verticalLineToRelative(0.931f)
                horizontalLineToRelative(1.778f)
                verticalLineToRelative(4.555f)
                horizontalLineToRelative(1.219f)
                verticalLineToRelative(-4.555f)
                horizontalLineToRelative(1.727f)
                verticalLineToRelative(-0.931f)
                close()
                moveTo(14.476f, 18.349f)
                verticalLineToRelative(5.486f)
                horizontalLineToRelative(3.793f)
                verticalLineToRelative(-0.889f)
                horizontalLineToRelative(-2.616f)
                verticalLineToRelative(-1.515f)
                horizontalLineToRelative(2.32f)
                verticalLineToRelative(-0.931f)
                horizontalLineToRelative(-2.32f)
                verticalLineToRelative(-1.219f)
                horizontalLineToRelative(2.489f)
                verticalLineToRelative(-0.931f)
                close()
                moveTo(18.438f, 18.349f)
                lineTo(20.588f, 23.835f)
                horizontalLineToRelative(1.304f)
                lineTo(24.0f, 18.349f)
                horizontalLineToRelative(-2.904f)
                verticalLineToRelative(0.931f)
                horizontalLineToRelative(1.388f)
                lineToRelative(-1.27f, 3.327f)
                lineToRelative(-1.558f, -4.258f)
                close()
                moveTo(1.151f, 19.28f)
                horizontalLineToRelative(0.931f)
                curveToRelative(0.927f, 0.0f, 1.558f, 0.674f, 1.515f, 1.812f)
                curveToRelative(-0.042f, 1.18f, -0.842f, 1.812f, -1.812f, 1.812f)
                horizontalLineToRelative(-0.635f)
                close()
            }
        }
        .build()
        return _datev!!
    }

private var _datev: ImageVector? = null
