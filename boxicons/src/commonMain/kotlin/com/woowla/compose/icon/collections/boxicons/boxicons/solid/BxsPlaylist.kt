package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsPlaylist: ImageVector
    get() {
        if (_bxsPlaylist != null) {
            return _bxsPlaylist!!
        }
        _bxsPlaylist = Builder(name = "BxsPlaylist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.493f)
                curveTo(13.0f, 18.427f, 14.573f, 20.0f, 16.507f, 20.0f)
                reflectiveCurveToRelative(3.507f, -1.573f, 3.507f, -3.507f)
                curveToRelative(0.0f, -0.177f, -0.027f, -0.347f, -0.053f, -0.517f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.333f)
                arcToRelative(3.465f, 3.465f, 0.0f, false, false, -1.493f, -0.346f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 13.0f, 16.493f)
                close()
                moveTo(2.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 11.0f)
                close()
                moveTo(2.0f, 13.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 15.0f)
                close()
                moveTo(2.0f, 17.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bxsPlaylist!!
    }

private var _bxsPlaylist: ImageVector? = null
