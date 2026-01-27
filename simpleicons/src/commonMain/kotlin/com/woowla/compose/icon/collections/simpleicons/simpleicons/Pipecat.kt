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

public val Simpleicons.Pipecat: ImageVector
    get() {
        if (_pipecat != null) {
            return _pipecat!!
        }
        _pipecat = Builder(name = "Pipecat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.309f, 5.116f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, 0.958f, 0.24f)
                lineTo(7.369f, 8.89f)
                horizontalLineToRelative(9.262f)
                lineToRelative(3.102f, -3.536f)
                arcToRelative(0.867f, 0.867f, 0.0f, false, true, 1.52f, 0.573f)
                verticalLineToRelative(7.807f)
                lineTo(24.0f, 13.734f)
                verticalLineToRelative(1.735f)
                horizontalLineToRelative(-4.482f)
                lineTo(19.518f, 8.232f)
                lineToRelative(-1.842f, 2.099f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, -0.652f, 0.295f)
                lineTo(6.976f, 10.626f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, -0.652f, -0.295f)
                lineToRelative(-1.842f, -2.1f)
                verticalLineToRelative(7.239f)
                lineTo(0.0f, 15.47f)
                verticalLineToRelative(-1.735f)
                horizontalLineToRelative(2.747f)
                lineTo(2.747f, 5.928f)
                curveToRelative(0.0f, -0.362f, 0.224f, -0.685f, 0.562f, -0.812f)
                moveToRelative(16.209f, 12.089f)
                lineTo(24.0f, 17.205f)
                verticalLineToRelative(1.735f)
                horizontalLineToRelative(-4.482f)
                close()
                moveTo(0.0f, 17.205f)
                horizontalLineToRelative(4.482f)
                verticalLineToRelative(1.735f)
                lineTo(0.0f, 18.94f)
                close()
                moveTo(9.253f, 14.313f)
                arcToRelative(1.157f, 1.157f, 0.0f, true, true, -2.314f, 0.0f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, true, 2.314f, 0.0f)
                moveToRelative(7.807f, 0.0f)
                arcToRelative(1.157f, 1.157f, 0.0f, true, true, -2.313f, 0.0f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, true, 2.313f, 0.0f)
            }
        }
        .build()
        return _pipecat!!
    }

private var _pipecat: ImageVector? = null
