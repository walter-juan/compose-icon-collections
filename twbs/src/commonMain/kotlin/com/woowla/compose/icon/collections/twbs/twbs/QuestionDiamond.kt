package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.QuestionDiamond: ImageVector
    get() {
        if (_questionDiamond != null) {
            return _questionDiamond!!
        }
        _questionDiamond = Builder(name = "QuestionDiamond", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.95f, 0.435f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0.0f)
                lineToRelative(6.515f, 6.516f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.519f, 0.0f, 2.098f)
                lineTo(9.05f, 15.565f)
                curveToRelative(-0.58f, 0.58f, -1.519f, 0.58f, -2.098f, 0.0f)
                lineTo(0.435f, 9.05f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, true, 0.0f, -2.098f)
                close()
                moveTo(8.35f, 1.135f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, -0.7f, 0.0f)
                lineTo(1.134f, 7.65f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.0f, 0.7f)
                lineToRelative(6.516f, 6.516f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.7f, 0.0f)
                lineToRelative(6.516f, -6.516f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, false, 0.0f, -0.7f)
                lineTo(8.35f, 1.134f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.255f, 5.786f)
                arcToRelative(0.237f, 0.237f, 0.0f, false, false, 0.241f, 0.247f)
                horizontalLineToRelative(0.825f)
                curveToRelative(0.138f, 0.0f, 0.248f, -0.113f, 0.266f, -0.25f)
                curveToRelative(0.09f, -0.656f, 0.54f, -1.134f, 1.342f, -1.134f)
                curveToRelative(0.686f, 0.0f, 1.314f, 0.343f, 1.314f, 1.168f)
                curveToRelative(0.0f, 0.635f, -0.374f, 0.927f, -0.965f, 1.371f)
                curveToRelative(-0.673f, 0.489f, -1.206f, 1.06f, -1.168f, 1.987f)
                lineToRelative(0.003f, 0.217f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, 0.246f)
                horizontalLineToRelative(0.811f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.105f)
                curveToRelative(0.0f, -0.718f, 0.273f, -0.927f, 1.01f, -1.486f)
                curveToRelative(0.609f, -0.463f, 1.244f, -0.977f, 1.244f, -2.056f)
                curveToRelative(0.0f, -1.511f, -1.276f, -2.241f, -2.673f, -2.241f)
                curveToRelative(-1.267f, 0.0f, -2.655f, 0.59f, -2.75f, 2.286f)
                moveToRelative(1.557f, 5.763f)
                curveToRelative(0.0f, 0.533f, 0.425f, 0.927f, 1.01f, 0.927f)
                curveToRelative(0.609f, 0.0f, 1.028f, -0.394f, 1.028f, -0.927f)
                curveToRelative(0.0f, -0.552f, -0.42f, -0.94f, -1.029f, -0.94f)
                curveToRelative(-0.584f, 0.0f, -1.009f, 0.388f, -1.009f, 0.94f)
            }
        }
        .build()
        return _questionDiamond!!
    }

private var _questionDiamond: ImageVector? = null
