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

public val Twbs.SignMergeLeft: ImageVector
    get() {
        if (_signMergeLeft != null) {
            return _signMergeLeft!!
        }
        _signMergeLeft = Builder(name = "SignMergeLeft", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 6.0f)
                verticalLineToRelative(1.0f)
                quadToRelative(-0.211f, 0.451f, -0.588f, 0.95f)
                curveToRelative(-0.537f, 0.716f, -1.259f, 1.44f, -2.016f, 2.196f)
                lineToRelative(0.708f, 0.708f)
                lineToRelative(0.015f, -0.016f)
                curveToRelative(0.652f, -0.652f, 1.33f, -1.33f, 1.881f, -2.015f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.216f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.192f, -0.41f)
                lineTo(8.192f, 3.23f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.384f, 0.0f)
                lineTo(5.842f, 5.59f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.192f, 0.41f)
                close()
            }
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
                moveTo(7.65f, 1.135f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, 0.7f, 0.0f)
                lineToRelative(6.516f, 6.515f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, 0.0f, 0.7f)
                lineTo(8.35f, 14.866f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, -0.7f, 0.0f)
                lineTo(1.134f, 8.35f)
                arcToRelative(0.495f, 0.495f, 0.0f, false, true, 0.0f, -0.7f)
                lineTo(7.65f, 1.134f)
                close()
            }
        }
        .build()
        return _signMergeLeft!!
    }

private var _signMergeLeft: ImageVector? = null
