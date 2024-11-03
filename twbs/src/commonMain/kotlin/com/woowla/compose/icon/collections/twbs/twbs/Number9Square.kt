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

public val Twbs.Number9Square: ImageVector
    get() {
        if (_number9Square != null) {
            return _number9Square!!
        }
        _number9Square = Builder(name = "Number9Square", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.777f, 12.146f)
                curveToRelative(-1.593f, 0.0f, -2.425f, -0.89f, -2.52f, -1.798f)
                horizontalLineToRelative(1.296f)
                curveToRelative(0.1f, 0.357f, 0.539f, 0.72f, 1.248f, 0.72f)
                curveToRelative(1.36f, 0.0f, 1.88f, -1.353f, 1.834f, -3.023f)
                horizontalLineToRelative(-0.076f)
                curveToRelative(-0.235f, 0.627f, -0.873f, 1.184f, -1.934f, 1.184f)
                curveToRelative(-1.395f, 0.0f, -2.566f, -0.961f, -2.566f, -2.666f)
                curveToRelative(0.0f, -1.711f, 1.242f, -2.731f, 2.87f, -2.731f)
                curveToRelative(1.512f, 0.0f, 2.971f, 0.867f, 2.971f, 4.014f)
                curveToRelative(0.0f, 2.836f, -1.02f, 4.3f, -3.123f, 4.3f)
                moveToRelative(0.118f, -3.972f)
                curveToRelative(0.808f, 0.0f, 1.535f, -0.528f, 1.535f, -1.594f)
                reflectiveCurveToRelative(-0.668f, -1.676f, -1.56f, -1.676f)
                curveToRelative(-0.838f, 0.0f, -1.517f, 0.616f, -1.517f, 1.659f)
                curveToRelative(0.0f, 1.072f, 0.708f, 1.61f, 1.54f, 1.61f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(15.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _number9Square!!
    }

private var _number9Square: ImageVector? = null
