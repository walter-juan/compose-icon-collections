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

public val Simpleicons.Thestorygraph: ImageVector
    get() {
        if (_thestorygraph != null) {
            return _thestorygraph!!
        }
        _thestorygraph = Builder(name = "Thestorygraph", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.172f, 0.625f)
                arcToRelative(0.679f, 0.679f, 0.0f, false, false, -0.131f, 0.025f)
                lineTo(14.095f, 1.818f)
                curveToRelative(-0.35f, 0.104f, -0.545f, 0.467f, -0.441f, 0.818f)
                lineToRelative(5.114f, 17.354f)
                curveToRelative(0.104f, 0.35f, 0.467f, 0.545f, 0.818f, 0.441f)
                lineToRelative(3.945f, -1.155f)
                curveToRelative(0.35f, -0.104f, 0.545f, -0.467f, 0.441f, -0.818f)
                lineTo(18.858f, 1.091f)
                arcToRelative(0.652f, 0.652f, 0.0f, false, false, -0.686f, -0.467f)
                close()
                moveTo(0.662f, 1.052f)
                curveToRelative(-0.363f, 0.0f, -0.662f, 0.299f, -0.662f, 0.662f)
                verticalLineToRelative(18.094f)
                curveToRelative(0.0f, 0.363f, 0.299f, 0.662f, 0.662f, 0.662f)
                horizontalLineToRelative(4.114f)
                curveToRelative(0.363f, 0.0f, 0.662f, -0.299f, 0.662f, -0.662f)
                lineTo(5.438f, 1.714f)
                curveToRelative(0.0f, -0.363f, -0.299f, -0.662f, -0.662f, -0.662f)
                close()
                moveTo(7.606f, 1.052f)
                curveToRelative(-0.363f, 0.0f, -0.662f, 0.299f, -0.662f, 0.662f)
                verticalLineToRelative(18.094f)
                curveToRelative(0.0f, 0.363f, 0.299f, 0.662f, 0.662f, 0.662f)
                lineTo(11.72f, 20.471f)
                curveToRelative(0.363f, 0.0f, 0.649f, -0.299f, 0.662f, -0.662f)
                lineTo(12.382f, 1.714f)
                curveToRelative(0.0f, -0.363f, -0.299f, -0.662f, -0.662f, -0.662f)
                close()
                moveTo(0.363f, 21.431f)
                curveToRelative(-0.195f, 0.0f, -0.363f, 0.156f, -0.363f, 0.363f)
                verticalLineToRelative(1.22f)
                curveToRelative(0.0f, 0.195f, 0.156f, 0.363f, 0.363f, 0.363f)
                horizontalLineToRelative(23.271f)
                curveToRelative(0.195f, 0.0f, 0.363f, -0.156f, 0.363f, -0.363f)
                verticalLineToRelative(-1.22f)
                curveToRelative(0.0f, -0.195f, -0.156f, -0.363f, -0.363f, -0.363f)
                close()
            }
        }
        .build()
        return _thestorygraph!!
    }

private var _thestorygraph: ImageVector? = null
