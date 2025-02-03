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

public val Simpleicons.Yolo: ImageVector
    get() {
        if (_yolo != null) {
            return _yolo!!
        }
        _yolo = Builder(name = "Yolo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 0.0f)
                curveToRelative(-3.05f, 0.0f, -5.52f, 2.477f, -5.52f, 5.523f)
                curveToRelative(0.0f, 3.842f, -3.125f, 6.967f, -6.972f, 6.967f)
                curveToRelative(-1.506f, 0.0f, -2.894f, -0.46f, -4.03f, -1.26f)
                curveToRelative(1.105f, 1.98f, 2.765f, 3.6f, 4.759f, 4.67f)
                verticalLineToRelative(2.51f)
                curveToRelative(0.0f, 3.04f, 2.428f, 5.56f, 5.463f, 5.59f)
                curveToRelative(3.07f, 0.0f, 5.58f, -2.46f, 5.58f, -5.52f)
                verticalLineTo(15.9f)
                curveToRelative(3.64f, -1.96f, 6.16f, -5.8f, 6.23f, -10.208f)
                verticalLineToRelative(-0.165f)
                curveTo(23.76f, 2.477f, 21.28f, 0.0f, 18.25f, 0.0f)
                close()
                moveTo(5.758f, 0.0f)
                curveTo(2.715f, 0.0f, 0.24f, 2.477f, 0.24f, 5.523f)
                curveToRelative(0.0f, 3.044f, 2.475f, 5.517f, 5.518f, 5.517f)
                curveToRelative(3.044f, 0.0f, 5.512f, -2.473f, 5.512f, -5.517f)
                curveToRelative(0.0f, -3.046f, -2.468f, -5.523f, -5.512f, -5.523f)
                close()
            }
        }
        .build()
        return _yolo!!
    }

private var _yolo: ImageVector? = null
