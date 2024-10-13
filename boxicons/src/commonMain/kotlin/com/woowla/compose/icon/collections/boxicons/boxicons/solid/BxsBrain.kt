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

public val SolidGroup.BxsBrain: ImageVector
    get() {
        if (_bxsBrain != null) {
            return _bxsBrain!!
        }
        _bxsBrain = Builder(name = "BxsBrain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.299f, 17.596f)
                curveToRelative(0.432f, 1.332f, 1.745f, 2.182f, 3.146f, 2.182f)
                lineTo(6.5f, 19.778f)
                arcTo(2.78f, 2.78f, 0.0f, false, false, 9.223f, 22.0f)
                curveToRelative(0.457f, 0.0f, 0.884f, -0.115f, 1.262f, -0.313f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, 0.515f, -0.882f)
                lineTo(11.0f, 3.027f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.785f, -0.983f)
                arcToRelative(2.324f, 2.324f, 0.0f, false, false, -1.479f, 0.201f)
                curveToRelative(-0.744f, 0.356f, -1.18f, 1.151f, -1.18f, 1.978f)
                verticalLineToRelative(0.055f)
                arcToRelative(2.778f, 2.778f, 0.0f, false, false, -2.744f, 4.433f)
                arcTo(3.327f, 3.327f, 0.0f, false, false, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.178f, 0.611f, 2.211f, 1.533f, 2.812f)
                curveToRelative(-0.43f, 0.771f, -0.571f, 1.746f, -0.234f, 2.784f)
                close()
                moveTo(19.188f, 8.711f)
                arcToRelative(2.778f, 2.778f, 0.0f, false, false, -2.744f, -4.433f)
                verticalLineToRelative(-0.055f)
                curveToRelative(0.0f, -0.826f, -0.437f, -1.622f, -1.181f, -1.978f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, -1.478f, -0.201f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.785f, 0.983f)
                verticalLineToRelative(17.777f)
                curveToRelative(0.0f, 0.365f, 0.192f, 0.712f, 0.516f, 0.882f)
                curveToRelative(0.378f, 0.199f, 0.804f, 0.314f, 1.261f, 0.314f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, false, 2.723f, -2.223f)
                horizontalLineToRelative(0.056f)
                curveToRelative(1.4f, 0.0f, 2.714f, -0.85f, 3.146f, -2.182f)
                curveToRelative(0.337f, -1.038f, 0.196f, -2.013f, -0.234f, -2.784f)
                arcTo(3.35f, 3.35f, 0.0f, false, false, 22.0f, 12.0f)
                arcToRelative(3.327f, 3.327f, 0.0f, false, false, -2.812f, -3.289f)
                close()
            }
        }
        .build()
        return _bxsBrain!!
    }

private var _bxsBrain: ImageVector? = null
