package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.AlphabetBangla: ImageVector
    get() {
        if (_alphabetBangla != null) {
            return _alphabetBangla!!
        }
        _alphabetBangla = Builder(name = "AlphabetBangla", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                curveToRelative(0.904f, -0.027f, 3.0f, 2.0f, 3.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                curveToRelative(0.0f, -0.955f, 0.0f, -2.0f, 0.786f, -2.677f)
                curveToRelative(1.262f, -1.089f, 3.025f, 0.55f, 3.2f, 2.06f)
                curveToRelative(0.086f, 0.741f, -0.215f, 3.109f, -1.489f, 4.527f)
                curveToRelative(-0.475f, 0.53f, -0.904f, 0.992f, -1.711f, 1.074f)
                curveToRelative(-0.75f, 0.076f, -1.364f, -0.122f, -2.076f, -0.588f)
                curveToRelative(-1.138f, -0.743f, -2.327f, -1.997f, -3.336f, -3.73f)
                curveToRelative(-1.078f, -1.849f, -1.66f, -3.113f, -2.374f, -5.666f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.37f, 7.072f)
                curveToRelative(0.769f, -0.836f, 5.246f, -4.094f, 8.4f, -0.202f)
                curveToRelative(0.382f, 0.472f, 0.573f, 0.708f, 0.9f, 1.63f)
                curveToRelative(0.326f, 0.921f, 0.326f, 1.562f, 0.326f, 2.844f)
                verticalLineToRelative(7.656f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                curveToRelative(0.0f, -1.989f, 1.5f, -4.0f, 4.0f, -4.0f)
            }
        }
        .build()
        return _alphabetBangla!!
    }

private var _alphabetBangla: ImageVector? = null
