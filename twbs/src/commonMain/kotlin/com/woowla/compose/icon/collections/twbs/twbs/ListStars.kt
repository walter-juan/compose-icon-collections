package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val Twbs.ListStars: ImageVector
    get() {
        if (_listStars != null) {
            return _listStars!!
        }
        _listStars = Builder(name = "ListStars", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.0f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.242f, 2.194f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, 0.516f, 0.0f)
                lineToRelative(0.162f, 0.53f)
                curveToRelative(0.035f, 0.115f, 0.14f, 0.194f, 0.258f, 0.194f)
                horizontalLineToRelative(0.551f)
                curveToRelative(0.259f, 0.0f, 0.37f, 0.333f, 0.164f, 0.493f)
                lineToRelative(-0.468f, 0.363f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.094f, 0.3f)
                lineToRelative(0.173f, 0.569f)
                curveToRelative(0.078f, 0.256f, -0.213f, 0.462f, -0.423f, 0.3f)
                lineToRelative(-0.417f, -0.324f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, -0.328f, 0.0f)
                lineToRelative(-0.417f, 0.323f)
                curveToRelative(-0.21f, 0.163f, -0.5f, -0.043f, -0.423f, -0.299f)
                lineToRelative(0.173f, -0.57f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.094f, -0.299f)
                lineToRelative(-0.468f, -0.363f)
                curveToRelative(-0.206f, -0.16f, -0.095f, -0.493f, 0.164f, -0.493f)
                horizontalLineToRelative(0.55f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.259f, -0.194f)
                close()
                moveTo(2.242f, 6.194f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, 0.516f, 0.0f)
                lineToRelative(0.162f, 0.53f)
                curveToRelative(0.035f, 0.115f, 0.14f, 0.194f, 0.258f, 0.194f)
                horizontalLineToRelative(0.551f)
                curveToRelative(0.259f, 0.0f, 0.37f, 0.333f, 0.164f, 0.493f)
                lineToRelative(-0.468f, 0.363f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.094f, 0.3f)
                lineToRelative(0.173f, 0.569f)
                curveToRelative(0.078f, 0.255f, -0.213f, 0.462f, -0.423f, 0.3f)
                lineToRelative(-0.417f, -0.324f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, -0.328f, 0.0f)
                lineToRelative(-0.417f, 0.323f)
                curveToRelative(-0.21f, 0.163f, -0.5f, -0.043f, -0.423f, -0.299f)
                lineToRelative(0.173f, -0.57f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.094f, -0.299f)
                lineToRelative(-0.468f, -0.363f)
                curveToRelative(-0.206f, -0.16f, -0.095f, -0.493f, 0.164f, -0.493f)
                horizontalLineToRelative(0.55f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.259f, -0.194f)
                close()
                moveTo(2.242f, 10.194f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, true, 0.516f, 0.0f)
                lineToRelative(0.162f, 0.53f)
                curveToRelative(0.035f, 0.115f, 0.14f, 0.194f, 0.258f, 0.194f)
                horizontalLineToRelative(0.551f)
                curveToRelative(0.259f, 0.0f, 0.37f, 0.333f, 0.164f, 0.493f)
                lineToRelative(-0.468f, 0.363f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.094f, 0.3f)
                lineToRelative(0.173f, 0.569f)
                curveToRelative(0.078f, 0.255f, -0.213f, 0.462f, -0.423f, 0.3f)
                lineToRelative(-0.417f, -0.324f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, -0.328f, 0.0f)
                lineToRelative(-0.417f, 0.323f)
                curveToRelative(-0.21f, 0.163f, -0.5f, -0.043f, -0.423f, -0.299f)
                lineToRelative(0.173f, -0.57f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.094f, -0.299f)
                lineToRelative(-0.468f, -0.363f)
                curveToRelative(-0.206f, -0.16f, -0.095f, -0.493f, 0.164f, -0.493f)
                horizontalLineToRelative(0.55f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.259f, -0.194f)
                close()
            }
        }
        .build()
        return _listStars!!
    }

private var _listStars: ImageVector? = null
