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

public val Twbs.HandIndexThumbFill: ImageVector
    get() {
        if (_handIndexThumbFill != null) {
            return _handIndexThumbFill!!
        }
        _handIndexThumbFill = Builder(name = "HandIndexThumbFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 1.75f)
                verticalLineToRelative(2.716f)
                lineToRelative(0.047f, -0.002f)
                curveToRelative(0.312f, -0.012f, 0.742f, -0.016f, 1.051f, 0.046f)
                curveToRelative(0.28f, 0.056f, 0.543f, 0.18f, 0.738f, 0.288f)
                curveToRelative(0.273f, 0.152f, 0.456f, 0.385f, 0.56f, 0.642f)
                lineToRelative(0.132f, -0.012f)
                curveToRelative(0.312f, -0.024f, 0.794f, -0.038f, 1.158f, 0.108f)
                curveToRelative(0.37f, 0.148f, 0.689f, 0.487f, 0.88f, 0.716f)
                quadToRelative(0.113f, 0.137f, 0.195f, 0.248f)
                horizontalLineToRelative(0.582f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.99f, 2.199f)
                lineToRelative(-0.272f, 2.715f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.444f, 1.389f)
                lineToRelative(-1.395f, 2.441f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.42f, 16.0f)
                horizontalLineTo(6.118f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.342f, -0.83f)
                lineToRelative(-1.215f, -2.43f)
                lineTo(1.07f, 8.589f)
                arcToRelative(1.517f, 1.517f, 0.0f, false, true, 2.373f, -1.852f)
                lineTo(5.0f, 8.293f)
                verticalLineTo(1.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 3.5f, 0.0f)
            }
        }
        .build()
        return _handIndexThumbFill!!
    }

private var _handIndexThumbFill: ImageVector? = null
