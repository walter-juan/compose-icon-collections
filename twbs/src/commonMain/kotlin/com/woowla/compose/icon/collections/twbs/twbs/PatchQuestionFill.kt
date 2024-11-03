package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PatchQuestionFill: ImageVector
    get() {
        if (_patchQuestionFill != null) {
            return _patchQuestionFill!!
        }
        _patchQuestionFill = Builder(name = "PatchQuestionFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.933f, 0.87f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 4.134f, 0.0f)
                lineToRelative(0.622f, 0.638f)
                lineToRelative(0.89f, -0.011f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 2.924f, 2.924f)
                lineToRelative(-0.01f, 0.89f)
                lineToRelative(0.636f, 0.622f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 0.0f, 4.134f)
                lineToRelative(-0.637f, 0.622f)
                lineToRelative(0.011f, 0.89f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -2.924f, 2.924f)
                lineToRelative(-0.89f, -0.01f)
                lineToRelative(-0.622f, 0.636f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -4.134f, 0.0f)
                lineToRelative(-0.622f, -0.637f)
                lineToRelative(-0.89f, 0.011f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, -2.924f, -2.924f)
                lineToRelative(0.01f, -0.89f)
                lineToRelative(-0.636f, -0.622f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 0.0f, -4.134f)
                lineToRelative(0.637f, -0.622f)
                lineToRelative(-0.011f, -0.89f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, true, 2.924f, -2.924f)
                lineToRelative(0.89f, 0.01f)
                close()
                moveTo(7.002f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                moveToRelative(1.602f, -2.027f)
                curveToRelative(0.04f, -0.534f, 0.198f, -0.815f, 0.846f, -1.26f)
                curveToRelative(0.674f, -0.475f, 1.05f, -1.09f, 1.05f, -1.986f)
                curveToRelative(0.0f, -1.325f, -0.92f, -2.227f, -2.262f, -2.227f)
                curveToRelative(-1.02f, 0.0f, -1.792f, 0.492f, -2.1f, 1.29f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 6.0f, 5.48f)
                curveToRelative(0.0f, 0.393f, 0.203f, 0.64f, 0.545f, 0.64f)
                curveToRelative(0.272f, 0.0f, 0.455f, -0.147f, 0.564f, -0.51f)
                curveToRelative(0.158f, -0.592f, 0.525f, -0.915f, 1.074f, -0.915f)
                curveToRelative(0.61f, 0.0f, 1.03f, 0.446f, 1.03f, 1.084f)
                curveToRelative(0.0f, 0.563f, -0.208f, 0.885f, -0.822f, 1.325f)
                curveToRelative(-0.619f, 0.433f, -0.926f, 0.914f, -0.926f, 1.64f)
                verticalLineToRelative(0.111f)
                curveToRelative(0.0f, 0.428f, 0.208f, 0.745f, 0.585f, 0.745f)
                curveToRelative(0.336f, 0.0f, 0.504f, -0.24f, 0.554f, -0.627f)
            }
        }
        .build()
        return _patchQuestionFill!!
    }

private var _patchQuestionFill: ImageVector? = null
