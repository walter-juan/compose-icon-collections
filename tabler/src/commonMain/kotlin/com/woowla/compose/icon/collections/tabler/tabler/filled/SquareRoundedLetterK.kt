package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.SquareRoundedLetterK: ImageVector
    get() {
        if (_squareRoundedLetterK != null) {
            return _squareRoundedLetterK!!
        }
        _squareRoundedLetterK = Builder(name = "SquareRoundedLetterK", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.676f, 2.001f)
                lineToRelative(0.324f, -0.001f)
                curveToRelative(7.752f, 0.0f, 10.0f, 2.248f, 10.0f, 10.0f)
                lineToRelative(-0.005f, 0.642f)
                curveToRelative(-0.126f, 7.235f, -2.461f, 9.358f, -9.995f, 9.358f)
                lineToRelative(-0.642f, -0.005f)
                curveToRelative(-7.13f, -0.125f, -9.295f, -2.395f, -9.358f, -9.67f)
                verticalLineToRelative(-0.325f)
                curveToRelative(0.0f, -7.643f, 2.185f, -9.936f, 9.676f, -9.999f)
                moveToRelative(2.854f, 5.151f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.378f, 0.318f)
                lineToRelative(-2.152f, 3.443f)
                verticalLineToRelative(-2.913f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-2.914f)
                lineToRelative(2.152f, 3.444f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.276f, 0.374f)
                lineToRelative(0.102f, -0.056f)
                lineToRelative(0.095f, -0.068f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.223f, -1.31f)
                lineToRelative(-2.17f, -3.47f)
                lineToRelative(2.17f, -3.47f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.318f, -1.378f)
            }
        }
        .build()
        return _squareRoundedLetterK!!
    }

private var _squareRoundedLetterK: ImageVector? = null
