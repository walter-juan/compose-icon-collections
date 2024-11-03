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

public val Twbs.SignMergeLeftFill: ImageVector
    get() {
        if (_signMergeLeftFill != null) {
            return _signMergeLeftFill!!
        }
        _signMergeLeftFill = Builder(name = "SignMergeLeftFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0.0f)
                lineTo(0.436f, 6.95f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0.0f, 2.098f)
                lineToRelative(6.516f, 6.516f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0.0f)
                lineToRelative(6.516f, -6.516f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0.0f, -2.098f)
                close()
                moveTo(7.25f, 6.0f)
                horizontalLineTo(6.034f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.192f, -0.41f)
                lineToRelative(1.966f, -2.36f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.384f, 0.0f)
                lineToRelative(1.966f, 2.36f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.192f, 0.41f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(8.823f)
                curveToRelative(-0.551f, 0.686f, -1.229f, 1.363f, -1.88f, 2.015f)
                lineToRelative(-0.016f, 0.016f)
                lineToRelative(-0.708f, -0.708f)
                curveToRelative(0.757f, -0.756f, 1.48f, -1.48f, 2.016f, -2.196f)
                quadToRelative(0.377f, -0.499f, 0.588f, -0.95f)
                close()
            }
        }
        .build()
        return _signMergeLeftFill!!
    }

private var _signMergeLeftFill: ImageVector? = null
