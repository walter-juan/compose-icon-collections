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

public val SolidGroup.BxsShieldAlt2: ImageVector
    get() {
        if (_bxsShieldAlt2 != null) {
            return _bxsShieldAlt2!!
        }
        _bxsShieldAlt2 = Builder(name = "BxsShieldAlt2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.881f, 5.223f)
                arcToRelative(0.496f, 0.496f, 0.0f, false, false, -0.747f, -0.412f)
                curveToRelative(-0.672f, 0.392f, -1.718f, 0.898f, -2.643f, 0.898f)
                curveToRelative(-0.421f, 0.0f, -0.849f, -0.064f, -1.289f, -0.198f)
                arcToRelative(5.712f, 5.712f, 0.0f, false, true, -0.808f, -0.309f)
                curveToRelative(-1.338f, -0.639f, -2.567f, -1.767f, -3.696f, -2.889f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -0.698f, -0.29f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, -0.698f, 0.29f)
                curveToRelative(-1.129f, 1.122f, -2.358f, 2.25f, -3.696f, 2.889f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(5.655f, 5.655f, 0.0f, false, true, -0.807f, 0.309f)
                curveToRelative(-0.44f, 0.134f, -0.869f, 0.198f, -1.289f, 0.198f)
                curveToRelative(-0.925f, 0.0f, -1.971f, -0.507f, -2.643f, -0.898f)
                arcToRelative(0.496f, 0.496f, 0.0f, false, false, -0.747f, 0.412f)
                curveToRelative(-0.061f, 1.538f, -0.077f, 4.84f, 0.688f, 7.444f)
                curveToRelative(1.399f, 4.763f, 4.48f, 7.976f, 8.91f, 9.292f)
                lineToRelative(0.14f, 0.041f)
                lineToRelative(0.14f, -0.014f)
                verticalLineTo(22.0f)
                verticalLineToRelative(-0.014f)
                horizontalLineTo(12.0f)
                lineToRelative(0.143f, 0.014f)
                lineToRelative(0.14f, -0.041f)
                curveToRelative(4.43f, -1.316f, 7.511f, -4.529f, 8.91f, -9.292f)
                curveToRelative(0.765f, -2.604f, 0.748f, -5.906f, 0.688f, -7.444f)
                close()
            }
        }
        .build()
        return _bxsShieldAlt2!!
    }

private var _bxsShieldAlt2: ImageVector? = null
