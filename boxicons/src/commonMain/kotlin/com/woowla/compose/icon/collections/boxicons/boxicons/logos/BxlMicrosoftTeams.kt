package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlMicrosoftTeams: ImageVector
    get() {
        if (_bxlMicrosoftTeams != null) {
            return _bxlMicrosoftTeams!!
        }
        _bxlMicrosoftTeams = Builder(name = "BxlMicrosoftTeams", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.288f, 8.344f)
                moveToRelative(-1.707f, 0.0f)
                arcToRelative(1.707f, 1.707f, 0.0f, true, true, 3.414f, 0.0f)
                arcToRelative(1.707f, 1.707f, 0.0f, true, true, -3.414f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.581f, 11.513f)
                horizontalLineToRelative(3.413f)
                verticalLineToRelative(3.656f)
                curveToRelative(0.0f, 0.942f, -0.765f, 1.706f, -1.707f, 1.706f)
                horizontalLineToRelative(-1.706f)
                verticalLineToRelative(-5.362f)
                close()
                moveTo(2.006f, 4.2f)
                verticalLineToRelative(15.6f)
                lineToRelative(11.213f, 1.979f)
                lineTo(13.219f, 2.221f)
                lineTo(2.006f, 4.2f)
                close()
                moveTo(10.294f, 9.611f)
                lineTo(8.344f, 9.66f)
                verticalLineToRelative(5.752f)
                lineTo(6.881f, 15.412f)
                lineTo(6.881f, 9.757f)
                lineToRelative(-1.949f, 0.098f)
                lineTo(4.932f, 8.539f)
                lineToRelative(5.362f, -0.292f)
                verticalLineToRelative(1.364f)
                close()
                moveTo(14.193f, 10.05f)
                verticalLineToRelative(8.288f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.808f, 0.0f, 1.463f, -0.655f, 1.463f, -1.462f)
                lineTo(17.606f, 10.05f)
                horizontalLineToRelative(-3.413f)
                close()
                moveTo(15.656f, 5.175f)
                curveToRelative(-0.586f, 0.0f, -1.105f, 0.264f, -1.463f, 0.673f)
                verticalLineToRelative(2.555f)
                curveToRelative(0.357f, 0.409f, 0.877f, 0.673f, 1.463f, 0.673f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, false, 0.0f, -3.901f)
                close()
            }
        }
        .build()
        return _bxlMicrosoftTeams!!
    }

private var _bxlMicrosoftTeams: ImageVector? = null
