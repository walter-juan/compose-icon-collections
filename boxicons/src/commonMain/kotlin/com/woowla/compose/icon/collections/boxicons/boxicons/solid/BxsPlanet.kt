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

public val SolidGroup.BxsPlanet: ImageVector
    get() {
        if (_bxsPlanet != null) {
            return _bxsPlanet!!
        }
        _bxsPlanet = Builder(name = "BxsPlanet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.165f, 15.582f)
                curveToRelative(4.587f, -4.073f, 8.141f, -9.424f, 6.057f, -11.771f)
                curveToRelative(-0.661f, -0.744f, -1.584f, -1.089f, -2.575f, -0.983f)
                curveToRelative(-0.832f, 0.091f, -1.687f, 0.502f, -2.549f, 1.192f)
                arcToRelative(8.922f, 8.922f, 0.0f, false, false, -8.712f, 0.282f)
                arcToRelative(8.917f, 8.917f, 0.0f, false, false, -4.109f, 5.515f)
                arcToRelative(8.892f, 8.892f, 0.0f, false, false, 0.306f, 5.325f)
                curveToRelative(-1.065f, 1.203f, -2.054f, 3.677f, -0.823f, 5.063f)
                curveToRelative(0.517f, 0.581f, 1.257f, 0.841f, 2.147f, 0.841f)
                curveToRelative(2.707f, 0.0f, 6.808f, -2.399f, 10.258f, -5.464f)
                close()
                moveTo(18.864f, 4.815f)
                curveToRelative(0.358f, -0.034f, 0.632f, 0.064f, 0.861f, 0.323f)
                curveToRelative(0.231f, 0.261f, 0.169f, 0.946f, -0.252f, 1.929f)
                arcToRelative(9.059f, 9.059f, 0.0f, false, false, -1.617f, -1.853f)
                curveToRelative(0.431f, -0.262f, 0.776f, -0.373f, 1.008f, -0.399f)
                close()
                moveTo(4.633f, 17.118f)
                arcToRelative(8.979f, 8.979f, 0.0f, false, false, 1.568f, 1.737f)
                curveToRelative(-1.025f, 0.303f, -1.714f, 0.283f, -1.945f, 0.021f)
                curveToRelative(-0.217f, -0.243f, 0.002f, -1.069f, 0.377f, -1.758f)
                close()
                moveTo(20.943f, 11.249f)
                curveToRelative(-1.215f, 1.797f, -2.906f, 3.671f, -4.778f, 5.333f)
                curveToRelative(-1.934f, 1.719f, -4.066f, 3.208f, -6.05f, 4.202f)
                arcToRelative(9.082f, 9.082f, 0.0f, false, false, 1.874f, 0.212f)
                arcToRelative(8.986f, 8.986f, 0.0f, false, false, 4.616f, -1.282f)
                arcToRelative(8.915f, 8.915f, 0.0f, false, false, 4.338f, -8.465f)
                close()
            }
        }
        .build()
        return _bxsPlanet!!
    }

private var _bxsPlanet: ImageVector? = null
