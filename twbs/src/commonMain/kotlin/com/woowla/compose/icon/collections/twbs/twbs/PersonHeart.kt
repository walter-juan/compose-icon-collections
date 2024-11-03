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

public val Twbs.PersonHeart: ImageVector
    get() {
        if (_personHeart != null) {
            return _personHeart!!
        }
        _personHeart = Builder(name = "PersonHeart", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                moveToRelative(-9.0f, 8.0f)
                curveToRelative(0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                reflectiveCurveToRelative(1.0f, 0.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, -4.0f, -6.0f, -4.0f)
                reflectiveCurveToRelative(-6.0f, 3.0f, -6.0f, 4.0f)
                moveToRelative(13.5f, -8.09f)
                curveToRelative(1.387f, -1.425f, 4.855f, 1.07f, 0.0f, 4.277f)
                curveToRelative(-4.854f, -3.207f, -1.387f, -5.702f, 0.0f, -4.276f)
                close()
            }
        }
        .build()
        return _personHeart!!
    }

private var _personHeart: ImageVector? = null
